  
package com.gokhantamkoc.ilkspringbootuygulamamodevi.exceptions;

@SuppressWarnings("serial")
public class ShapeNotFoundException extends NotFoundException{
	  public ShapeNotFoundException(int id){
	        super(String.format("Aradığınız Ürün Maalesef Bulunamadı :( (id => %s)",id));
   }
}