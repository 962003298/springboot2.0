package com.springboot2.itmq;

import com.springboot2.itmq.entity.Boots;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



import java.awt.print.Book;
import java.util.HashMap;


@SpringBootTest
class ItmqApplicationTests {
//    @Autowired
//    RabbitTemplate rabbitTemplate;
//    @Autowired
//    AmqpAdmin amqpAdmin;
//
////    @Test
////    void contextLoads() {
////        User user = new User();
////        user.setName("张三");
////        user.setAge("15");
////
////        User user2 = new User();
////        user2.setName("李四");
////        user2.setAge("17");
////
////        User user3 = new User();
////        user3.setName("王二");
////        user3.setAge("16");
////
////        User user4 = new User();
////        user4.setName("张三");
////        user4.setAge("15");
////
////        Set<User> set = new HashSet<User>();
////        set.add(user);
////        set.add(user2);
////        set.add(user3);
////        set.add(user4);
////        System.out.println(set);
////    }
//
//    /**
//     * 分页测试
//     */
//    @Test
//    void show() {
////        UserDto userDto=new UserDto();
////        userDto.setName("1");
////        userDto.setPageNum(1);
////        userDto.setPageSize(1);
////        UserController userController = new UserController();
////        PageInfo pageInfo = userController.selectByUserNamePage(userDto);
////        System.out.println(pageInfo.getPageSize());
//    }
//
//    /**
//     * rabbitmq测试类（点对点发送数据）
//     */
//   @Test
//    void contextLoads(){
//        // Message需要自己构造一个;定义消息体内容和消息头
//       //rabbitTemplate.send(exchager,routekey,message);
//       //object默认当成消息体，只需要传入要发送的对象，自动序列化发送给rabbitmq;
////       HashMap<String, Object> map = new HashMap<>();
////       map.put("msg","第一个消息");
////       //对象默认被序列化以后发送出去
////       rabbitTemplate.convertAndSend("exchanges.direct","atguigu.news",map);
//   }
//
//    /**
//     * rabbitmq 接收数据
//     */
//   @Test
//    void receive(){
////       Object o = rabbitTemplate.receiveAndConvert("atguigu.news");
////       System.out.println(o.getClass());
////       System.out.println(o);
//   }
//
//    /**
//     *  rabbitmq 广播模式
//     */
//    @Test
//    void contextLoads2(){
////        Boots boot=new Boots();
////        boot.setName("三国演义");
////        boot.setPwd("罗贯中");
////
////        rabbitTemplate.convertAndSend("exchanges.fanot","",boot);
//    }
//    /**
//     * rabbitmq
//     *   AmqpAdmin :RabbitMQ系统管理功能组件
//     */
//    @Test
//    void contextLoads3(){
//        //创建交换器
//        amqpAdmin.declareExchange(new DirectExchange("maqing.exchange"));
//        System.out.println("交换器创建成功");
//        //创建队列
//        amqpAdmin.declareQueue(new Queue("maqing.queue",true));
//        System.out.println("交换器创建成功");
//        //交换器和队列绑定
//        amqpAdmin.declareBinding(new Binding("maqing.queue", Binding.DestinationType.QUEUE,"maqing.exchange","amqp.haha",null));
//    }

}
