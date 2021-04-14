package com.epam.test3;

import java.io.*;
import java.util.*;

public class InputStreamReader {

    private final InputStream inputStream;

    public InputStreamReader(InputStream in) {

        this.inputStream = in;
    }

    public String readLine() {

        Scanner scanner = new Scanner (this.inputStream);
        return scanner.nextLine ();
    }
}

