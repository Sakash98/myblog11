// ResourceNotFoundException.java
package com.myblog.myblog11.exception;

public class ResourceNotFoundException extends RuntimeException { // Extending RuntimeException

    public ResourceNotFoundException(String message) {
        super(message); // Calling superclass constructor
    }
}
