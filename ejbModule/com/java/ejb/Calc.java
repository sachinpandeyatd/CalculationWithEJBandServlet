package com.java.ejb;

import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Calc
 */
@Stateless
@Remote(CalcRemote.class)
public class Calc implements CalcRemote {

    /**
     * Default constructor. 
     */
    public Calc() {
        
    }
    
    @Override
    public double sum(int a, int b){
    	return a+b;
    }
    
    @Override
    public double substraction(int a, int b){
    	return a-b;
    }

    @Override
    public double product(int a, int b){
    	return a*b;
    }

    @Override
    public double quotient(int a, int b){
    	return a/b;
    }

}
