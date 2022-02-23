package _15_Exception.Ex.Su_dung_lop_IllegalTriangleException;

import java.util.Scanner;

public class IllegalTriangleException extends Exception {
    private String message;
    public IllegalTriangleException(String message) {
        this.message = message ;
    }

    @Override
    public String toString() {
        return message;
    }
}