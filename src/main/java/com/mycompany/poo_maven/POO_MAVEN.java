package com.mycompany.poo_maven;
import javax.swing.JOptionPane;
import static spark.Spark.*;

public class POO_MAVEN {

    public static void main(String[] args) {
         get("/test/:mensaje", (req, res) -> {
            msgbox(req.params(":mensaje"));
            return saludar();
        });
        
        
        get("/sumar/:a/:b", (req, res) -> {
            int parametroA = Integer.parseInt(req.params(":a"));
            int parametroB = Integer.parseInt(req.params(":b"));
           
            res.type("application/json");
            String paramA = "\"paramA\": "+parametroA+",";
            String paramB = "\"paramB\": "+parametroB;
            
            return "{\"result\":"+sumar(parametroA, parametroB)  +"," +
                    paramA + paramB +"}";

            // return sum(parametroA, parametroB);
        });

        get("/restar/:a/:b", (req, res) -> {
            int parametroA = Integer.parseInt(req.params(":a"));
            int parametroB = Integer.parseInt(req.params(":b"));
            
            res.type("application/json");
            String paramA = "\"paramA\": "+parametroA+",";
            String paramB = "\"paramB\": "+parametroB;
            
            return "{\"result\":"+restar(parametroA, parametroB)  +"," +
                    paramA + paramB +"}";
        });
        
        get("/dividir/:a/:b", (req, res) -> {
            int parametroA = Integer.parseInt(req.params(":a"));
            int parametroB = Integer.parseInt(req.params(":b"));
            
            res.type("application/json");
            String paramA = "\"paramA\": "+parametroA+",";
            String paramB = "\"paramB\": "+parametroB;
            
            return "{\"result\":"+dividir(parametroA, parametroB)  +"," +
                    paramA + paramB +"}";
        });
        
         get("/multiplicar/:a/:b", (req, res) -> {
            int parametroA = Integer.parseInt(req.params(":a"));
            int parametroB = Integer.parseInt(req.params(":b"));
            
            res.type("application/json");
            String paramA = "\"paramA\": "+parametroA+",";
            String paramB = "\"paramB\": "+parametroB;
            
            return "{\"result\":"+multiplicar(parametroA, parametroB)  +"," +
                    paramA + paramB +"}";
        });
    }
    
    private static int sumar(int a, int b){
        return a+b;
    }
    
    private static int restar(int a, int b){
        return a-b;
    }

    private static int dividir(int a, int b){
        return a/b;
    }
    
    private static int multiplicar(int a, int b){
        return a*b;
    }
    
    private static void msgbox(String s) {
        JOptionPane.showMessageDialog(null, s);
    }

    public static String saludar() {
        System.out.println("Solo te saludo cada que ejecutes la APP");
        return "Solo te saludo cada que ejecutes la APP";
    }
}
