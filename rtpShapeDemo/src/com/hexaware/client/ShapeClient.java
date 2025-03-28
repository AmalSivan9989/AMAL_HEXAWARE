package com.hexaware.client;

import com.hexaware.entity.Cone;
import com.hexaware.entity.Cylinder;
import com.hexaware.entity.IShape;
import com.hexaware.entity.Sphere;

import java.util.HashMap;
import java.util.Map;

public class ShapeClient {
   static Map<String, IShape> map=new HashMap<>();
   static {
       map.put("cyl",new Cylinder());
       map.put("cone",new Cone());
       map.put("sphere",new Sphere());

   }
   public static void main(String[] args) {
       char ch ='y';
       String option = null;
       do {
           System.out.println("Select the shape --> cyl/cone/sphere");
           option = IShape.scan.next();
           IShape obj =map.get(option);
           if(obj != null) {
               obj.acceptdata();
               System.out.println(obj.findVolume());
           }else {
               System.out.println("invalid shape");
           }
           ch = IShape.scan.next().charAt(0);
       }while(ch=='Y' || ch == 'y');
   }
}
