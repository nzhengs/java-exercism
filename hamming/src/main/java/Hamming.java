class Hamming {

    String leftStrand;
    String rightStrand;

    Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    int getHammingDistance() {
        char[] leftStrandChars = leftStrand.toCharArray();
        char[] rightStrandChars = rightStrand.toCharArray();
        int hammingDistance = 0;
        for (int i = 0; i < leftStrandChars.length; i++) {
            if (leftStrandChars[i] != rightStrandChars[i]) {
                hammingDistance++;
            }
        }
        return hammingDistance;
    }


}
