/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.csis.java.zoo.basic;

/**
 *
 * @author Dr. Case
 */
public class Aardvark extends Animal {
    
    @Override
    public void speak() {
        System.out.println("I'm an Aardvark!");
        System.out.println("I love to eat Ants and Termites!");
    }
    
    @Override
    public void move() {
        System.out.println("When I move, I walk, walk, walk.");
    }
    
}