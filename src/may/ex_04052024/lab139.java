package may.ex_04052024;

public class lab139 {
    public static void main(String[] args) {
        int [][] array_2d = {
                {34,12},
                {34,12},  //3row 2 colume
                {34,12}
        };
        int row = array_2d.length;
        for (int i = 0; i < row ; i++) { //ROWs 0,1
            for (int j = 0; j < array_2d[i].length ; j++) { //colume 0,1,2
                System.out.println(array_2d[i][j]);
            }
        } /// array_2d[i].length _will give the colume
    }
    }

