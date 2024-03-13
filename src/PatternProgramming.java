public class PatternProgramming {
    public static void main(String[] args) {
        int n = 6;

        int pascalsNum = 4;

        System.out.println("Number Increasing Pyramid Pattern:");
        numberIncreasingPyramidPattern(n);
        System.out.println();

        System.out.println("Number Increasing Reverse Pyramid Pattern:");
        numberIncreasingReversePyramidPattern(n);
        System.out.println();

        System.out.println("Number Changing Pyramid Pattern:");
        numberChangingPyramidPattern(n);
        System.out.println();

        System.out.println("Number Triangle Pattern:");
        numberTrianglePattern(n);
        System.out.println();

        System.out.println("Reverse Number Triangle Pattern:");
        reverseNumberTrianglePattern(n);
        System.out.println();

        System.out.println("Mirror Image Triangle Pattern:");
        mirrorImageTrianglePattern(n);
        System.out.println();

        System.out.println("Zero One Triangle Pattern:");
        zeroOneTrianglePattern(n);
        System.out.println();

        System.out.println("Palindrome Triangle Pattern:");
        palindromeTrianglePattern(n);
        System.out.println();

        System.out.println("Pascals Triangle Pattern:");
        pascalsTrianglePattern(pascalsNum);
        System.out.println();

        System.out.println("Right Pascals Triangle Star Pattern:");
        rightPascalsTriangleStarPattern(pascalsNum);
        System.out.println();

        System.out.println("K Star Pattern:");
        kStarPattern(n);
        System.out.println();

        System.out.println("Square Fill Star Pattern:");
        squareFillStarPattern(n);
        System.out.println();

        System.out.println("Square Hollow Star Pattern:");
        squareHollowStarPattern(n);
        System.out.println();

        System.out.println("Rhombus Star Pattern:");
        rhombusStarPattern(n);
        System.out.println();

        System.out.println("Left Arrow Rhombus Star Pattern:");
        leftArrowRhombusStarPattern(n);
        System.out.println();

        System.out.println("Hollow Triangle Star Pattern:");
        hollowTriangleStarPattern(n);
        System.out.println();

        System.out.println("Hollow Reverse Triangle Star Pattern:");
        hollowReverseTriangleStarPattern(n);
        System.out.println();

        System.out.println("Hollow Diamond Pyramid Star Pattern:");
        hollowDiamondPyramidStarPattern(n);
        System.out.println();

        System.out.println("Hollow Hourglass Star Pattern:");
        hollowHourglassStarPattern(n);
        System.out.println();

        System.out.println("Triangle Star Pattern:");
        triangleStarPattern(n);
        System.out.println();

        System.out.println("Diamond Star Pattern:");
        diamondStarPattern(n);
        System.out.println();

        System.out.println("Right Half Pyramid Pattern:");
        rightHalfPyramidPattern(n);
        System.out.println();

        System.out.println("Reverse Right Half Pyramid Pattern:");
        reverseRightHalfPyramidPattern(n);
        System.out.println();

        System.out.println("Left Half Pyramid Pattern:");
        leftHalfPyramidPattern(n);
        System.out.println();

        System.out.println("Reverse Left Half Pyramid Pattern:");
        reverseLeftHalfPyramidPattern(n);
        System.out.println();

        System.out.println("Butterfly Star Pattern:");
        butterflyStarPattern(n);
        System.out.println();
    }

    //number increasing pyramid pattern method
    private static void numberIncreasingPyramidPattern(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    //number increasing reverse pyramid pattern method
    public static void numberIncreasingReversePyramidPattern(int n) {
        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    //number changing pyramid pattern method
    public static void numberChangingPyramidPattern(int n) {
        int num = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    //number triangle pattern method
    public static void numberTrianglePattern(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    //reverse number triangle pattern method
    public static void reverseNumberTrianglePattern(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for(int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    //mirror image triangle pattern method
    public static void mirrorImageTrianglePattern(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for(int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for(int i = n - 1; i >= 1; i--) {
            for(int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for(int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    //zero one triangle pattern method
    public static void zeroOneTrianglePattern(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                if((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                }
                else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

    //palindrome triangle pattern method
    public static void palindromeTrianglePattern(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for(int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for(int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    //pascals triangle pattern method
    public static void pascalsTrianglePattern(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            int x = 1;
            for(int k = 1; k <= i; k++) {
                System.out.print(x + " ");
                x = x * (i - k) / k;
            }
            System.out.println();
        }
    }

    //right pascals triangle star pattern method
    public static void rightPascalsTriangleStarPattern(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n - 1; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // k star pattern method
    public static void kStarPattern(int n) {
        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 2; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //square fill star pattern method
    public static void squareFillStarPattern(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //square hollow star pattern method
    public static void squareHollowStarPattern(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //rhombus star pattern method
    public static void rhombusStarPattern(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //left arrow rhombus star pattern method
    public static void leftArrowRhombusStarPattern(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n - 1; i >= 1; i--) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //hollow triangle star pattern method
    public static void hollowTriangleStarPattern(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * i - 1); k++) {
                if(k == 1 || i == n || k == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //hollow reverse triangle star pattern method
    public static void hollowReverseTriangleStarPattern(int n) {
        for(int i = n; i >= 1; i--) {
            for(int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * i - 1); k++) {
                if(k == 1 || i == n || k == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //hollow diamond pyramid star pattern method
    public static void hollowDiamondPyramidStarPattern(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i - 1; j++) {
                if(j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i = n - 1; i >= 1; i--) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i - 1; j++) {
                if(j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //hollow hourglass star pattern method
    public static void hollowHourglassStarPattern(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for(int j = i; j <= n; j++) {
                if(j == i || j == n || i == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int i = n - 1; i >= 1; i--) {
            for(int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for(int j = i; j <= n; j++) {
                if(j == i || j == n || i == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    //triangle star pattern method
    public static void triangleStarPattern(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //diamond star pattern method
    public static void diamondStarPattern(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n - 1; i >= 1; i--) {
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //right half pyramid pattern method
    private static void rightHalfPyramidPattern(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //reverse right half pyramid pattern method
    private static void reverseRightHalfPyramidPattern(int n) {
        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //left half pyramid pattern method
    private static void leftHalfPyramidPattern(int n) {
        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //reverse left half pyramid pattern method
    private static void reverseLeftHalfPyramidPattern(int n) {
        int num = 2 * n - 2;
        for(int i = n; i > 0; i--) {
            for(int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            num = num - 2;
            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //butterfly star pattern method
    private static void butterflyStarPattern(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for(int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for(int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
