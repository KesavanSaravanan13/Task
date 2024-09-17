import java.util.Scanner;

class patternTriangleException extends Exception {
    public patternTriangleException() {
        super("Wrong Option!!!!");
    }
}

class TriPattern {
    private int val;

    public TriPattern(int val) {
        this.val = val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void topRight(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                if (val > 90) {
                    this.setVal(65);
                } else if (val == 57) {
                    this.setVal(48);
                }
                System.out.print(" ");
                System.out.print((char) (val++));
            }
            System.out.println();
        }
    }

    public void topLeft(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = n; j >= 0; j--) {
                if (val > 90) {
                    this.setVal(65);
                } else if (val == 57) {
                    this.setVal(48);
                }
                System.out.print(" ");
                if (j == 0 || i == n || i == j || i > j)
                    System.out.print((char) (val++));
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void bottomRight(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = n; j >= 0; j--) {
                if (val > 90) {
                    this.setVal(65);
                } else if (val == 57) {
                    this.setVal(48);
                }
                System.out.print(" ");
                if (j == n || j == i || i == 0 || i < j)
                    System.out.print((char) (val++));
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void bottomLeft(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = n; j >= 0; j--) {
                if (val > 90) {
                    this.setVal(65);
                } else if (val == 57) {
                    this.setVal(48);
                }
                System.out.print(" ");
                if (j == 0 || i == 0 || i == n - j || j < n - i)
                    System.out.print((char) (val++));
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public void fullTriangle(int n) {
        for (int i = 0; i <= n / 2; i++) {
            for (int j = n; j > (n / 2); j--) {
                if (val > 90) {
                    this.setVal(65);
                } else if (val == 57) {
                    this.setVal(48);
                }
                System.out.print(" ");
                if (i == j || i == j - (n / 2) || i > j - (n / 2) - 1)
                    System.out.print((char) (val++));
                else
                    System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if (val > 90) {
                    this.setVal(65);
                } else if (val == 57) {
                    this.setVal(48);
                }
                System.out.print(" ");
                System.out.print((char) (val++));
            }
            System.out.println();
        }
    }

    public void rhombus(int n) {
        for (int i = 0; i <= n / 2; i++) {
            for (int j = n; j > (n / 2); j--) {
                if (val > 90) {
                    this.setVal(65);
                } else if (val == 57) {
                    this.setVal(48);
                }
                System.out.print(" ");
                if (i == j || i == j - (n / 2) || i > j - (n / 2) - 1)
                    System.out.print((char) (val++));
                else
                    System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if (val > 90) {
                    this.setVal(65);
                } else if (val == 57) {
                    this.setVal(48);
                }
                System.out.print(" ");
                System.out.print((char) (val++));
            }
            System.out.println();
        }
        for (int i = 0; i < n / 2; i++) {
            for (int j = n; j > n / 2; j--) {
                if (val > 90) {
                    this.setVal(65);
                } else if (val == 57) {
                    this.setVal(48);
                }
                System.out.print(" ");
                if (j == n - i - 2 || j < n - i - 1) {
                    System.out.print((char) (val++));
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = n / 2; j >= 0; j--) {
                if (val > 90) {
                    this.setVal(65);
                } else if (val == 57) {
                    this.setVal(48);
                }
                System.out.print(" ");
                if (i < j) {
                    System.out.print((char) (val++));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

public class patternTriangle {
    public static void main(String[] args) throws patternTriangleException {
        try (Scanner sc = new Scanner(System.in)) {
            int cc = 1;
            do {
                System.out.print("Choose The Options : \n   1.Top right\n   2.Top left\n   3.Bottom right\n   4.Bottom left\n   5.Full Triangle\n   6.Rhombus\n   7.Exit\n Enter Your Choice : ");
                int choice = sc.nextInt();
                if (choice > 7) {
                    throw new patternTriangleException();
                } else if (choice == 7) {
                    break;
                }
                System.out.print("What do you prefer?\n   1.Alphabets\n   2.Number\n your preference : ");
                int preferenceChoice = sc.nextInt();
                int i = 0;
                i = preferenceChoice == 1 ? 65 : 48;
                TriPattern pattern = new TriPattern(i);
                switch (choice) {
                    case 1:
                        pattern.topRight(7);
                        break;
                    case 2:
                        pattern.topLeft(7);
                        break;
                    case 3:
                        pattern.bottomRight(7);
                        break;
                    case 4:
                        pattern.bottomLeft(7);
                        break;
                    case 5:
                        pattern.fullTriangle(25);
                        break;
                    case 6:
                        pattern.rhombus(5);
                        break;
                    case 7:
                        cc = 0;
                        break;
                    default:
                        throw new patternTriangleException();
                }
            } while (cc == 1);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
