package bsu.rfe.java.group10.lab4.Buryakov.varA1;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class GraphInput {
    public static void main(String[] args) {
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream("parabola.bin"))) {
            for (double x = -10; x <= 10; x += 0.5) {
                double y = x * x + 10* x ;
                out.writeDouble(x);
                out.writeDouble(y);
            }
            System.out.println("Файл parabola.bin успешно создан!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}