package com.java.ejb;

import javax.ejb.Remote;

@Remote
public interface CalcRemote {

	double sum(int a, int b);

	double substraction(int a, int b);

	double product(int a, int b);

	double quotient(int a, int b);

}
