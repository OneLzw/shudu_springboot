package com.easy.dever.service;


import java.util.List;
import java.util.Map;

public interface CountNineService {

    public boolean getRightShu (int[][] shu);

    public boolean getPerfectShu(int[][] shu);

    public void writeToTxt (int[][] data , String nameIndex , boolean perfect) throws Exception;

    public List<List<Integer>> getFinishShu(int[][] data);

    public Map<String , List<int[][]>> getHistory();

    public int[][] getIntArray(String str);

    public boolean getNine(int[][] data);
}
