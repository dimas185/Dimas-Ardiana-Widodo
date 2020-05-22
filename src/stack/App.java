/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Dimas Ardiana
 */
public class App {
     public static void main( String[] args ){
        Stack stack=new Stack();
        stack.push("Dimas");
        stack.push("Ardiana");
        stack.push("http://Dimas-ardiana.com");
        
        int count=stack.count();
        Object object=stack.peek();
        System.out.println("Jumlah Data Pada Stack : "+count);
        System.out.println("Data Teratas Pada Stack : "+object);
        
        System.out.println("===================================");
        
        object=stack.pop();
        System.out.println("Objek yang dikeluarkan (Pop) : "+object);
        count=stack.count();
        System.out.println("Jumlah Data Pada Stack setelah Pop: "+count);
        object=stack.peek();
        System.out.println("Data Teratas Pada Stack setelah Pop: "+object);
    }
}

