package com.myspring.core;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 通过此类加载myspring配置文件，并且将bean加载至map中
 * Created by Administrator on 2018/6/12.
 */
public class ApplicationXmlContext {

    //存放所有的bean定义的集合
    private List<BeanDefinition> definitions = new ArrayList<>();


    private Map<String,Object> beans = new HashMap<>();

    public ApplicationXmlContext() {
        this("myspring.xml");
    }


    public ApplicationXmlContext(String filePath) {
        InputStream in = this.getClass().getClassLoader().getResourceAsStream(filePath);
        SAXReader reader = new SAXReader();
        Document doc = null;
        try {
            doc = reader.read(in);
            List<Node> list = doc.selectNodes("/beans/bean");
            for(Node node:list){
                BeanDefinition definition = new BeanDefinition();
                definition.setClassName(node.valueOf("@class"));
                definition.setId(node.valueOf("@id"));
                definition.setName(node.valueOf("@name"));
                List<Node> properties = node.selectNodes("//property");
                List<Property> propMaps = new ArrayList<>();
                for(Node property:properties){
                    propMaps.add(new Property(property.valueOf("@name"),property.valueOf("@value")));
                }
                definition.setProperties(propMaps);
                definitions.add(definition);
            }
            setEnvironment();
        } catch (DocumentException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    /**
     * 根据定义通过反射创建bean，并加入到beans中
     */
    private void setEnvironment() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        for(BeanDefinition definition:definitions){
            String mark = definition.getId();
            if(mark==null||"".equals(mark)){
                mark = definition.getName();
            }

            Class clazz = Class.forName(definition.getClassName());
            Object ins = clazz.newInstance();
            for(Property property:definition.getProperties()){
                try {
                    Field f = clazz.getDeclaredField(property.getName());
                    Class<?> parameterType = f.getType();
                    Method setter = clazz.getMethod("set" + property.getName().substring(0, 1).toUpperCase() + property.getName().substring(1),parameterType);
                    setter.invoke(ins,property.getValue());
                    beans.put(mark,ins);
                } catch (NoSuchFieldException | NoSuchMethodException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }





    public Object getBean(String name){

        return beans.get(name);
    }
}
