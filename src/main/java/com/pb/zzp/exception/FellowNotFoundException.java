package com.pb.zzp.exception;

public class FellowNotFoundException extends Exception{

    public FellowNotFoundException(String message, String... messageArgs) {
        super(String.format(message, (Object[]) messageArgs));
    }
}
