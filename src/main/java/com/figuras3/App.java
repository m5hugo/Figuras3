package com.figuras3;


public final class App {
    private App() {
    }

    /**
     * @param args The arguments of the program.
     */
    public static void main(String[] args) throws Exception {
    	
        System.out.println("-------------- Hello World!-----------------\n\n");
        
        try {
            Circulo circulo = new Circulo(3);
            System.out.println("Area Circulo de radio " + circulo.getRadi() + ": " + circulo.areaCirculo());
        }
        catch (Exception e) {
             System.out.println(e.getMessage());
        }
    }
}

