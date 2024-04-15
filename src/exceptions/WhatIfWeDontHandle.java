package exceptions;

import java.io.IOException;

// here the program doesn't execute properly as we didnt handle the runtime exception properly
public class WhatIfWeDontHandle extends RuntimeException{
    public static void main(String[] args){
        try {
            System.out.println(5/0);
        } finally {
            System.out.println("Reached finally statement");
        }
        System.out.println("program executed successfully");
    }
}
