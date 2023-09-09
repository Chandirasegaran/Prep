package patternsprinting;

public class PatternsPrinting {

    void pattern1(int val) {
        for (int i = 1; i <= val; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    void pattern2(int val) {
        for (int i = 1; i <= val; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    void pattern3(int val) {
        int temp = val;
        for (int i = 1; i <= val; i++) {
            for (int j = 0; j < temp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
            temp -= 1;
        }
    }

    void pattern4(int val) {
        int temp = val;
        for (int i = 1; i <= val; i++) {
            for (int j = 0; j < temp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
            temp -= 1;
        }
    }

    void pattern5(int val) {
        int temp = val;
        for (int i = 1; i <= val; i++) {
            for (int j = 0; j < temp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
            temp -= 1;
        }
    }

    void pattern6(int val) {
        int temp = val - 1;
        for (int i = 1; i <= val; i++) {
            for (int j = 0; j < temp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
            temp -= 1;
        }
    }

    void pattern7(int val) {
        System.out.println("Value : " + val);
        int n = 1;
        for (int i = 1; i <= val; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(n + " ");
                n = n + 1;
            }
            System.out.println("");
        }
    }

    void pattern8(int val) {
        for (int i = 1; i <= val; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == j || j == 1) {
                    System.out.print(j);
                } else if (i == val) {
                    break;
                } else {
                    System.out.print(" ");
                }
            }
            if (i == val) {
                for (int j = 2; j <= val; j++) {
                    System.out.print(j);
                }
            }
            System.out.println("");
        }
    }

    void pattern9(int val) {
        for (int i = 1; i <= val; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == j || j == 1) {
                    System.out.print("*");
                } else if (i == val) {
                    break;
                } else {
                    System.out.print(" ");
                }
            }
            if (i == val) {
                for (int j = 2; j <= val; j++) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }

    void pattern10(int val) {
        for (int i = val; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    void pattern11(int val) {
        for (int i = val; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    void pattern12(int val) {
        int temp = 0;
        for (int i = val; i >= 1; i--) {
            for (int j = 0; j < temp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
            temp += 1;
        }
    }

    void pattern13(int val) {
        int temp = 0;
        for (int i = val; i >= 1; i--) {
            for (int j = 0; j < temp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
            temp += 1;
        }
    }

    void pattern14(int val) {
        int temp = 1;
        for (int i = val; i >= 1; i--) {
            for (int j = 0; j < temp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
            temp += 1;
        }
    }

    void pattern15(int val) {
        int temp = 1;
        for (int i = val; i >= 1; i--) {
            for (int j = 0; j < temp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
            temp += 1;
        }
    }

    void pattern16(int val) {
        int temp = 1;
        for (int i = val; i >= 1; i--) {
            if (i == val) {
                for (int j = 1; j <= val; j++) {
                    System.out.print(j);
                }
            }
            for (int j = 1; j < val; j++) {
                if (i == val) {
                    break;
                } else if (j == 1) {
                    System.out.print(temp);
                } else if (i == j) {
                    System.out.print(val);
                } else {
                    System.out.print(" ");
                }
            }
            temp += 1;
            System.out.println("");
        }
    }

    void pattern17(int val) {
        for (int i = val; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (i == j || j == 1) {
                    System.out.print("*");
                } else if (i == val) {
                    break;
                } else {
                    System.out.print(" ");
                }
            }
            if (i == val) {
                for (int j = 2; j <= val; j++) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }

    void pattern18(int val) {
        int temp = val;
        for (int i = 1; i <= val; i++) {
            for (int j = 0; j < temp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (i == val) {
                    break;
                }
                if (j == 1 || i == j) {
                    System.out.print(j + " ");
                } else {
                    System.out.print("  ");
                }
            }
            if (i == val) {
                for (int j = 1; j <= val; j++) {
                    System.out.print(j + " ");
                }
            }
            System.out.println("");
            temp -= 1;
        }
    }
    void pattern19(int val) {
        int temp = val;
        for (int i = 1; i <= val; i++) {
            for (int j = 0; j < temp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if (i == val) {
                    break;
                }
                if (j == 1 || i == j) {
                    System.out.print( "* ");
                } else {
                    System.out.print("  ");
                }
            }
            if (i == val) {
                for (int j = 1; j <= val; j++) {
                    System.out.print( "* ");
                }
            }
            System.out.println("");
            temp -= 1;
        }
    }
    
    void pattern20(int val){
        int temp = val;
        for (int i = 1; i <= val; i++) {
            for (int j = 0; j < temp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
            temp -= 1;
        }
        int temp1 = 2;
        for (int i = val-1; i >= 1; i--) {
            for (int j = 0; j < temp1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
            temp1 += 1;
        }
    }
            
    void pattern21(int val){
        int temp = val;
        for (int i = 1; i <= val; i++) {
            for (int j = 0; j < temp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print( "* ");
            }
            System.out.println("");
            temp -= 1;
        }
        int temp1 = 1;
        for (int i = val; i >= 1; i--) {
            for (int j = 0; j < temp1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print( "* ");
            }
            System.out.println("");
            temp1 += 1;
        }
    }
            
    void pattern22(int val){
        int temp = val;
        for (int i = 1; i <= val; i++) {
            for (int j = 0; j < temp; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if(j!=1&&j!=i){
                
                System.out.print( "  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println("");
            temp -= 1;
        }
        int temp1 = 1;
        for (int i = val; i >= 1; i--) {
            for (int j = 0; j < temp1; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if(j!=1&&j!=i){
                
                System.out.print( "  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println("");
            temp1 += 1;
        }
    }
            
    void pattern23(int val){
        int temp = val;
        for (int i = 1; i <= val; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print( "* ");
            }
            System.out.println("");
            temp -= 1;
        }
        int temp1 = 2;
        for (int i = val-1; i >= 1; i--) {
           
            for (int j = 1; j <= i; j++) {
                System.out.print( "* ");
            }
            System.out.println("");
            temp1 += 1;
        }
    }
            
    public static void main(String[] args) {
        // TODO code application logic here
        PatternsPrinting pp = new PatternsPrinting();
        pp.pattern1(5); // Number Half Triangel
        System.out.println(""); 
        pp.pattern2(5); // Star Half Triangle
        System.out.println("");
        pp.pattern3(5); // Number Half Triangel right aligned
        System.out.println("");
        pp.pattern4(5); // star Half Triangel right aligned
        System.out.println("");
        pp.pattern5(5); // Number Praymid
        System.out.println("");
        pp.pattern6(5); // Star Praymid
        System.out.println("");
        pp.pattern7(7); // Number triangle (continous number)
        System.out.println("");
        pp.pattern8(9); // Hallow Half Triangle Number
        System.out.println("");
        pp.pattern9(9); // Hallow Half Triangle Star
        System.out.println("");
        pp.pattern10(5); // Number Half Triangel Inverted   
        System.out.println("");
        pp.pattern11(5); // star Half Triangel Inverted
        System.out.println("");
        pp.pattern12(5); // Number Half Triangel right aligned Inverted
        System.out.println("");
        pp.pattern13(5); // Star Half Triangel right aligned Inverted
        System.out.println("");
        pp.pattern14(5); //  Number Praymid Inverted
        System.out.println("");
        pp.pattern15(5); //  Star Praymid Inverted
        System.out.println("");
        pp.pattern16(5); //  Number Half Triangel Inverted Hallow
        System.out.println("");
        pp.pattern17(5); //  Star Half Triangel Inverted Hallow
        System.out.println("");
        pp.pattern18(5); //  Number Triangel Hallow
        System.out.println("");
        pp.pattern19(5); //  Star Triangel Hallow
        System.out.println("");
        pp.pattern20(5); //  Diamond Number
        System.out.println("");
        pp.pattern21(5); //  Diamond star
        System.out.println("");
        pp.pattern22(5); //  Diamond star hallow
        System.out.println("");
        pp.pattern23(5); //  Diamond star left aligned
        System.out.println("");
        
           
    }

}
