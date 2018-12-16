class ReverseString {

    String reverse(String inputString) {
        char[] input = inputString.toCharArray();
        char[] output = new char[input.length];
        int j = 0;
        for (int i = input.length - 1; i >= 0; i--) {
            output[j] = input[i];
            j++;
        }
        return new String(output);
    }
}