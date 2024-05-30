package com.example.painteasy.ui.canvas;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001:B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0001J\u000e\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u0001J\u0012\u0010\"\u001a\u00020\u001e2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0014J(\u0010#\u001a\u00020\u001e2\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\b2\u0006\u0010&\u001a\u00020\b2\u0006\u0010\'\u001a\u00020\bH\u0014J\u0010\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0017J\u0006\u0010,\u001a\u00020\u001eJ\u000e\u0010-\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\u000eJ\u000e\u0010/\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\u000eJ\u001a\u00100\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u000e2\b\u00101\u001a\u0004\u0018\u000102H\u0002J\u001a\u00103\u001a\u00020\u001e2\u0006\u0010.\u001a\u00020\u000e2\b\u00101\u001a\u0004\u0018\u000102H\u0002J\u000e\u00104\u001a\u00020\u001e2\u0006\u00105\u001a\u00020\bJ\u000e\u00106\u001a\u00020\n2\u0006\u00107\u001a\u00020\nJ\b\u00108\u001a\u00020\u001eH\u0002J\u0006\u00109\u001a\u00020\u001eR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0018\u00010\u0013R\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0014\u001a\f\u0012\b\u0012\u00060\u0013R\u00020\u00000\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\f\u0012\b\u0012\u00060\u0013R\u00020\u00000\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006;"}, d2 = {"Lcom/example/painteasy/ui/canvas/DrawingView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "brushColor", "", "brushSize", "", "canvas", "Landroid/graphics/Canvas;", "canvasBitmap", "Landroid/graphics/Bitmap;", "canvasPaint", "Landroid/graphics/Paint;", "drawPaint", "drawPath", "Lcom/example/painteasy/ui/canvas/DrawingView$CustomPath;", "paths", "Ljava/util/ArrayList;", "result", "", "getResult", "()Ljava/lang/String;", "setResult", "(Ljava/lang/String;)V", "undonePaths", "clearDrawing", "", "getBitmap", "view", "getBitmapJpg", "onDraw", "onSizeChanged", "w", "h", "oldw", "oldh", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "redoPath", "saveBitmap", "bitmap", "saveBitmapJpg", "saveDrawingToStream", "outputStream", "Ljava/io/OutputStream;", "saveDrawingToStreamJpg", "setBrushColor", "newColor", "setBrushSize", "size", "setUpDrawing", "undoPath", "CustomPath", "app_debug"})
public final class DrawingView extends android.view.View {
    private android.graphics.Canvas canvas;
    private android.graphics.Bitmap canvasBitmap;
    private android.graphics.Paint drawPaint;
    private android.graphics.Paint canvasPaint;
    private com.example.painteasy.ui.canvas.DrawingView.CustomPath drawPath;
    private java.util.ArrayList<com.example.painteasy.ui.canvas.DrawingView.CustomPath> paths;
    private java.util.ArrayList<com.example.painteasy.ui.canvas.DrawingView.CustomPath> undonePaths;
    private float brushSize = 20.0F;
    private int brushColor = android.graphics.Color.BLACK;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String result;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getResult() {
        return null;
    }
    
    public final void setResult(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    private final void setUpDrawing() {
    }
    
    @java.lang.Override()
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
    }
    
    /**
     * This method is called when a stroke is drawn on the canvas
     * as a part of the painting.
     */
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.Nullable()
    android.graphics.Canvas canvas) {
    }
    
    /**
     * This method acts as an event listener when a touch
     * event is detected on the device.
     */
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    @java.lang.Override()
    public boolean onTouchEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    public final float setBrushSize(float size) {
        return 0.0F;
    }
    
    public final void setBrushColor(int newColor) {
    }
    
    public final void undoPath() {
    }
    
    public final void redoPath() {
    }
    
    public final void clearDrawing() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String saveBitmap(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap getBitmap(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    private final void saveDrawingToStream(android.graphics.Bitmap bitmap, java.io.OutputStream outputStream) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String saveBitmapJpg(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap bitmap) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Bitmap getBitmapJpg(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return null;
    }
    
    private final void saveDrawingToStreamJpg(android.graphics.Bitmap bitmap, java.io.OutputStream outputStream) {
    }
    
    public DrawingView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 0}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/example/painteasy/ui/canvas/DrawingView$CustomPath;", "Landroid/graphics/Path;", "color", "", "brushThickness", "", "(Lcom/example/painteasy/ui/canvas/DrawingView;IF)V", "getBrushThickness", "()F", "setBrushThickness", "(F)V", "getColor", "()I", "setColor", "(I)V", "app_debug"})
    public final class CustomPath extends android.graphics.Path {
        private int color;
        private float brushThickness;
        
        public final int getColor() {
            return 0;
        }
        
        public final void setColor(int p0) {
        }
        
        public final float getBrushThickness() {
            return 0.0F;
        }
        
        public final void setBrushThickness(float p0) {
        }
        
        public CustomPath(int color, float brushThickness) {
            super();
        }
    }
}