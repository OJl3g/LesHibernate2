package org.OJl3g;

import org.OJl3g.entity.HibernateUtil;
import org.hibernate.SessionFactory;

/**
 * Задача
 * Имя проекта Hibernate2
 * Создать класс Auto
 * Свойства id  , model ,Engine
 * принять все данные в конструкторе
 *
 * класс Engine
 * свойства :
 * id, мощность , название
 *
 * добавить зависимости хайбернейта
 * проект на маване
 *
 * создать файл с конфигами в ресурсах
 * и получить SessionFactory  в маине
 *
 *
 *
 * Реализовать  Дао класс с CRUD методами для авто
 *
 */
public class App 
{
    public static void main( String[] args ) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    }
}
