/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.lambda;

import java.util.List;

/**
 *
 * @author Mark
 */
public class GenericWildcards<T> {

    // This class and all its super types.
    public void superTypes(List<? super T> list) {}
    
    // This class and all is sub types.
    public void subTypes(List<? extends T> list) {}
}
