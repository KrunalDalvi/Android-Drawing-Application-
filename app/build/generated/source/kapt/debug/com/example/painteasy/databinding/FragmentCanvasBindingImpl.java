package com.example.painteasy.databinding;
import com.example.painteasy.R;
import com.example.painteasy.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentCanvasBindingImpl extends FragmentCanvasBinding implements com.example.painteasy.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.flDrawingViewContainer, 11);
        sViewsWithIds.put(R.id.ivBackground, 12);
        sViewsWithIds.put(R.id.drawingView, 13);
        sViewsWithIds.put(R.id.cvToolsPanel, 14);
        sViewsWithIds.put(R.id.hsvRight, 15);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCanvasBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private FragmentCanvasBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.cardview.widget.CardView) bindings[14]
            , (com.example.painteasy.ui.canvas.DrawingView) bindings[13]
            , (android.widget.FrameLayout) bindings[11]
            , (android.widget.HorizontalScrollView) bindings[15]
            , (android.widget.ImageButton) bindings[6]
            , (android.widget.ImageButton) bindings[5]
            , (android.widget.ImageButton) bindings[1]
            , (android.widget.ImageButton) bindings[7]
            , (android.widget.ImageButton) bindings[2]
            , (android.widget.ImageButton) bindings[10]
            , (android.widget.ImageButton) bindings[9]
            , (android.widget.ImageButton) bindings[4]
            , (android.widget.ImageButton) bindings[8]
            , (android.widget.ImageButton) bindings[3]
            , (android.widget.ImageView) bindings[12]
            );
        this.ibBackgroundImage.setTag(null);
        this.ibBrushColor.setTag(null);
        this.ibBrushSize.setTag(null);
        this.ibClearCanvas.setTag(null);
        this.ibEraseDraw.setTag(null);
        this.ibMoveLeft.setTag(null);
        this.ibMoveRight.setTag(null);
        this.ibRedoDraw.setTag(null);
        this.ibShareDrawing.setTag(null);
        this.ibUndoDraw.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback8 = new com.example.painteasy.generated.callback.OnClickListener(this, 8);
        mCallback6 = new com.example.painteasy.generated.callback.OnClickListener(this, 6);
        mCallback4 = new com.example.painteasy.generated.callback.OnClickListener(this, 4);
        mCallback2 = new com.example.painteasy.generated.callback.OnClickListener(this, 2);
        mCallback10 = new com.example.painteasy.generated.callback.OnClickListener(this, 10);
        mCallback9 = new com.example.painteasy.generated.callback.OnClickListener(this, 9);
        mCallback7 = new com.example.painteasy.generated.callback.OnClickListener(this, 7);
        mCallback5 = new com.example.painteasy.generated.callback.OnClickListener(this, 5);
        mCallback3 = new com.example.painteasy.generated.callback.OnClickListener(this, 3);
        mCallback1 = new com.example.painteasy.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.canvas == variableId) {
            setCanvas((com.example.painteasy.ui.canvas.CanvasFragment) variable);
        }
        else if (BR.drawing == variableId) {
            setDrawing((com.example.painteasy.ui.canvas.DrawingView) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCanvas(@Nullable com.example.painteasy.ui.canvas.CanvasFragment Canvas) {
        this.mCanvas = Canvas;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.canvas);
        super.requestRebind();
    }
    public void setDrawing(@Nullable com.example.painteasy.ui.canvas.DrawingView Drawing) {
        this.mDrawing = Drawing;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.drawing);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.example.painteasy.ui.canvas.CanvasFragment canvas = mCanvas;
        com.example.painteasy.ui.canvas.DrawingView drawing = mDrawing;
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.ibBackgroundImage.setOnClickListener(mCallback6);
            this.ibBrushColor.setOnClickListener(mCallback5);
            this.ibBrushSize.setOnClickListener(mCallback1);
            this.ibClearCanvas.setOnClickListener(mCallback7);
            this.ibEraseDraw.setOnClickListener(mCallback2);
            this.ibMoveLeft.setOnClickListener(mCallback10);
            this.ibMoveRight.setOnClickListener(mCallback9);
            this.ibRedoDraw.setOnClickListener(mCallback4);
            this.ibShareDrawing.setOnClickListener(mCallback8);
            this.ibUndoDraw.setOnClickListener(mCallback3);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 8: {
                // localize variables for thread safety
                // canvas
                com.example.painteasy.ui.canvas.CanvasFragment canvas = mCanvas;
                // canvas != null
                boolean canvasJavaLangObjectNull = false;



                canvasJavaLangObjectNull = (canvas) != (null);
                if (canvasJavaLangObjectNull) {


                    canvas.shareDrawing();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // canvas
                com.example.painteasy.ui.canvas.CanvasFragment canvas = mCanvas;
                // canvas != null
                boolean canvasJavaLangObjectNull = false;



                canvasJavaLangObjectNull = (canvas) != (null);
                if (canvasJavaLangObjectNull) {


                    canvas.imageBackground();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // drawing != null
                boolean drawingJavaLangObjectNull = false;
                // drawing
                com.example.painteasy.ui.canvas.DrawingView drawing = mDrawing;



                drawingJavaLangObjectNull = (drawing) != (null);
                if (drawingJavaLangObjectNull) {


                    drawing.redoPath();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // canvas
                com.example.painteasy.ui.canvas.CanvasFragment canvas = mCanvas;
                // canvas != null
                boolean canvasJavaLangObjectNull = false;



                canvasJavaLangObjectNull = (canvas) != (null);
                if (canvasJavaLangObjectNull) {


                    canvas.eraser();
                }
                break;
            }
            case 10: {
                // localize variables for thread safety
                // canvas
                com.example.painteasy.ui.canvas.CanvasFragment canvas = mCanvas;
                // canvas != null
                boolean canvasJavaLangObjectNull = false;



                canvasJavaLangObjectNull = (canvas) != (null);
                if (canvasJavaLangObjectNull) {



                    canvas.moveScroll(1);
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // canvas
                com.example.painteasy.ui.canvas.CanvasFragment canvas = mCanvas;
                // canvas != null
                boolean canvasJavaLangObjectNull = false;



                canvasJavaLangObjectNull = (canvas) != (null);
                if (canvasJavaLangObjectNull) {



                    canvas.moveScroll(0);
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // drawing != null
                boolean drawingJavaLangObjectNull = false;
                // drawing
                com.example.painteasy.ui.canvas.DrawingView drawing = mDrawing;



                drawingJavaLangObjectNull = (drawing) != (null);
                if (drawingJavaLangObjectNull) {


                    drawing.clearDrawing();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // canvas
                com.example.painteasy.ui.canvas.CanvasFragment canvas = mCanvas;
                // canvas != null
                boolean canvasJavaLangObjectNull = false;



                canvasJavaLangObjectNull = (canvas) != (null);
                if (canvasJavaLangObjectNull) {


                    canvas.brushColor();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // drawing != null
                boolean drawingJavaLangObjectNull = false;
                // drawing
                com.example.painteasy.ui.canvas.DrawingView drawing = mDrawing;



                drawingJavaLangObjectNull = (drawing) != (null);
                if (drawingJavaLangObjectNull) {


                    drawing.undoPath();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // canvas
                com.example.painteasy.ui.canvas.CanvasFragment canvas = mCanvas;
                // canvas != null
                boolean canvasJavaLangObjectNull = false;



                canvasJavaLangObjectNull = (canvas) != (null);
                if (canvasJavaLangObjectNull) {


                    canvas.brush();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): canvas
        flag 1 (0x2L): drawing
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}