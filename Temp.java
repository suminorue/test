package other;

public class Temp {
    int size = 7;
    int data = 1;
    int counter = 0;
    int i = 0;
    int j = 0;
    int maxI=size;
    int minI=0;
    int maxJ=size;
    int minJ=-1;
    int[][] massive = new int[size][size];

    public void build() {
        while (data <= size*size) {
            if (counter % 2 == 0) {
                while (j < maxJ&&j>minJ) {
                    massive[i][j] = data;
                    System.out.println(data+"|"+i+"|"+j);
                    data++;
                    if ((counter / 2) % 2 == 0) {
                        if (j+1==maxJ) {
                            i++;
                            maxJ--;
                            break;
                        }
                        j++;
                        continue;
                    } else if ((counter / 2) % 2 == 1) {
                        if(j-1==minJ) {
                            i--;
                            minJ++;
                            break;
                        }
                        j--;
                        continue;
                    }
                }
                counter++;
                //i++;
                //maxI--;
                //minI++;
            }
            else {
                while (i < maxI&&i>minI) {
                    massive[i][j] = data;
                    System.out.println(data+"|"+i+"|"+j);
                    data++;
                    if ((counter / 2) % 2 == 0) {
                        if (i+1==maxI) {
                            j--;
                            maxI--;
                            break;
                        }
                        i++;
                        continue;
                    } else if ((counter / 2) % 2 == 1) {
                        if (i-1==minI) {
                            j++;
                            minI++;
                            break;
                        }
                        i--;
                        continue;
                    }
                }
                //i++;
                //maxI--;
                counter++;
                //maxJ--;
                //minJ++;
            }
        }
    }

    public void writeMassive() {
        for (int i = 0; i < size; i++) {
            System.out.println("");
            for (int j = 0; j < size; j++) {
                System.out.print(massive[i][j]+"   ");
            }
        }
    }

    public static void main(String[] args) {
        Temp test = new Temp();
        test.build();
        test.writeMassive();
    }
}
