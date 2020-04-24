package com.solid.SOLID.liskovbad;

import java.util.HashSet;
import java.util.Set;

public class TwoDBoard implements Board{

	private Set<Point> points;
	
	public TwoDBoard() {
		this.points = new HashSet<Point>();
	}

	@Override
	public void addPoint(int x, int y) {
		points.add(new Point(x, y));
	}

	@Override
	public Point removePoint(int x, int y) {
		Point point = new Point(x, y);
		if (points.remove(point)) {
			return point;
		}
		else {
			return null;
		}
	}

	@Override
	public void addPoint(int x, int y, int z) {
		throw new RuntimeException("You can not add 3d point to 2d board");	
	}

	@Override
	public Point removePoint(int x, int y, int z) {
		throw new RuntimeException("You can not remove 3d point to 2d board");
	}
}
