package com.solid.SOLID.liskovbad;

public interface Board {

	public void addPoint(int x,int y);
	public Point removePoint(int xi,int y);
	
	public void addPoint(int x,int y,int z);
	public Point removePoint(int x,int y,int z);
}
