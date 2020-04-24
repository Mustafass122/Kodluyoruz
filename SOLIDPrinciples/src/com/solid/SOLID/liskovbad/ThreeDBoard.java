package com.solid.SOLID.liskovbad;

import java.util.HashSet;
import java.util.Set;

public class ThreeDBoard implements Board{

	private Set<ThreeDPoint> points;

	public ThreeDBoard() {
		this.points = new HashSet<ThreeDPoint>();
	}

	@Override
	public void addPoint(int x, int y) {
		throw new RuntimeException("You can not add 2d point to 3d board");
	}

	@Override
	public Point removePoint(int xi, int y) {
		throw new RuntimeException("You can not remove 2d point to 3d board");
	}

	@Override
	public void addPoint(int x, int y, int z) {
		points.add(new ThreeDPoint(x, y, z));
	}

	@Override
	public Point removePoint(int x, int y, int z) {
		ThreeDPoint tDPoint = new ThreeDPoint(x, y, z);
		if (points.remove(tDPoint)) {
			return tDPoint;
		}
		else {
			return null;
		}
	}

}
