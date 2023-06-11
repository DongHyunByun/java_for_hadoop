package com.fastcampus.de.java.clip12;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class TryWithResourceStatement {
    public static void main(String[] args) throws IOException {
        // type 1
        FileOutputStream out = new FileOutputStream("test.text");
        try {
            out.write("Hello World".getBytes(StandardCharsets.UTF_8));
            out.flush(); // 실제로 파일에 쓰기위한 함수(commit 역할)
        } catch (IOException e) {
            e.printStackTrace();
        }
        out.close();

        // type 2
        // try문안에 명세를 넣어주면 close하지않아도 자동으로 resource회수 가능
        try (FileOutputStream out2 = new FileOutputStream("test.text")) {
            out.write("Hello World".getBytes(StandardCharsets.UTF_8));
            out.flush(); // 실제로 파일에 쓰기위한 함수(commit 역할)
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
