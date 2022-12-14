package com.reactnativemetasdk;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = MetaSdkModule.NAME)
public class MetaSdkModule extends NativeMetaSdkSpec {
    public static final String NAME = "MetaSdk";

    public MetaSdkModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    @NonNull
    public String getName() {
        return NAME;
    }

    // Example method
    // See https://reactnative.dev/docs/native-modules-android
    @Override
    public double multiply(double a, double b) {
        return a * b;
    }
}
