package com.hrushikesh;

import java.util.ArrayList;

public class Maze_BacktrackingRecursion {

	public static void main(String[] args) {
		 int count=path(3,3);
		 System.out.println(count);

//		 path("",3,3);
//
//		System.out.println(pathRet("", 3, 3));
		
//		boolean[][] maze=new boolean[][] {{true,true,true},{true,false,true},{true,true,true}};
//		
//		System.out.println(pathRestriction("",0,0,maze));
	}

	private static ArrayList<String> pathRestriction(String p, int r, int c, boolean[][] maze) {
		if(r==maze.length-1 && c==maze[0].length-1) {
			ArrayList<String> temp = new ArrayList<>();
			temp.add(p);
			return temp;
		}
		ArrayList<String> list = new ArrayList<>();
		
		if(!maze[r][c]) {
			return list;
		}
		
		if(r<maze.length-1) {
			list.addAll(pathRestriction(p+'D', r+1, c, maze));
		}
		
		if(c<maze[0].length-1) {
			list.addAll(pathRestriction(p+'R', r, c+1, maze));
		}
		
		return list;
	}

	private static ArrayList<String> pathRet(String p, int r, int c) {
		if (r == 1 && c == 1) {
			ArrayList<String> temp = new ArrayList<>();
			temp.add(p);
			return temp;
		}
		ArrayList<String> list = new ArrayList<>();

		if (r > 1) {
			list.addAll(pathRet(p + 'D', r - 1, c));
		}
		if (c > 1) {
			list.addAll(pathRet(p + 'R', r, c - 1));
		}
		return list;
	}

	private static void path(String p, int r, int c) {
		if (r == 1 && c == 1) {
			System.out.println(p);
			return;
		}

		if (r > 1) {
			path(p + 'D', r - 1, c);
		}
		if (c > 1) {
			path(p + 'R', r, c - 1);
		}

	}

	private static int path(int r, int c) {
		if (r == 1 || c == 1) {
			return 1;
		}

		int left = path(r - 1, c);
		int right = path(r, c - 1);

		return left + right;
	}

}
