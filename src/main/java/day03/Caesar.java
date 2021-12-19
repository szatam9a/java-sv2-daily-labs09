package day03;

import java.util.ArrayList;
import java.util.List;

public class Caesar extends Encryption {
    private int offset;

    public Caesar(int offset) {
        this.offset = offset;
    }

    @Override
    public String encrypts(String input) {
        char[] in = input.toUpperCase().toCharArray();
        char[] out = new char[input.length()];

        for (int i = 0; i < input.length(); i++) {
            if (( (in[i] + offset)) > 'Z') {
                out[i] = (char)
                        ('A' + (((in[i] + offset) - 'Z'))-1);
            } else {
                out[i] = (char) (in[i] + offset);
            }
        }
        return new String(out);
    }
}

