package com.example.server.enumeration;

/**
 * Every enum constant is an OBJECT of its own. The SERVER_UP & SERVER_DOWN enum constant
 * objects both have their own unique copy of the instance variable "status".
 *
 * The constructor will initialize each enum constant object, and assign the
 * value in its parenthesis to their unique copy of the instance variable "status".
 */
public enum Status {
    SERVER_UP("SERVER_UP"), SERVER_DOWN("SERVER_DOWN");

    private final String status;

    Status(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return this.status;
    }
}
