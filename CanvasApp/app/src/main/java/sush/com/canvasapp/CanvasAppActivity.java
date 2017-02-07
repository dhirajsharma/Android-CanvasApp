package dhirajcom.canvasapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.graphics.*;
import android.view.View;
import android.content.Context;


public class CanvasAppActivity extends ActionBarActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyView myView=new MyView(this);
        setContentView(myView);
    }

    public class MyView extends View {
        public MyView(Context context){
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

            /*
            Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
            paint.setColor(Color.RED);
            int width=canvas.getWidth();
            int height=canvas.getHeight();
            Log.d("width", String.valueOf(width));
            Log.d("height", String.valueOf(height));
            float center_x = (float) width/2;
            float center_y = (float) height/2;
            canvas.drawCircle(center_x,center_y,70,paint); */

      /*      Paint paint = new Paint();
            paint.setColor(Color.RED);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(10);
            paint.setStrokeCap(Paint.Cap.ROUND);
            canvas.drawPoint(20, 20, paint);
            canvas.drawPoint(50, 50, paint);
            canvas.drawPoint(100, 100, paint); */

        /*    Paint paint = new Paint();
            paint.setColor(Color.RED);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(10);
            canvas.drawLine(20,100,120,100, paint);
            canvas.drawLine(120,100,120,200, paint); */

          /*  float ptsArray[]=new float[8];
            ptsArray[0]=20;
            ptsArray[1]=100;
            ptsArray[2]=120;
            ptsArray[3]=100;
            ptsArray[4]=120;
            ptsArray[5]=100;
            ptsArray[6]=120;
            ptsArray[7]=200;
            Paint paint = new Paint();
            paint.setColor(Color.RED);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(10);
            canvas.drawLines(ptsArray, 4, 4, paint); */

         /*   Paint paint = new Paint();
            paint.setColor(Color.RED);
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(10);
            Path path = new Path();
            path.moveTo(20, 100);
            path.lineTo(120, 100);
            path.lineTo(120, 200);
            paint.setStrokeCap(Paint.Cap.ROUND);
            canvas.drawPath(path, paint); */

       /*     Paint paint = new Paint();
            paint.setColor(Color.RED);
            paint.setStyle(Paint.Style.STROKE);
            Rect rect = new Rect();
            rect.set(100,100,300,300);
            paint.setStrokeWidth(5);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawRect(rect, paint); */

        /*    Paint paint = new Paint();
            paint.setColor(Color.RED);
            paint.setStyle(Paint.Style.FILL);
            final RectF rectf = new RectF(100, 100, 300, 300);
            canvas.drawRoundRect(rectf, 100, 100, paint); */

            Paint paint = new Paint();
            paint.setColor(Color.RED);
            paint.setStyle(Paint.Style.FILL);
            RectF rectf = new RectF(100, 100, 300, 200);
            canvas.drawOval(rectf,  paint);

        /*   Paint paint = new Paint();
            paint.setColor(Color.RED);
           // paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(5);
            RectF rectf = new RectF(100, 100, 300, 300);
            canvas.drawArc(rectf, 90, 270, false, paint); */

          /* Paint paint = new Paint();
            canvas.drawColor(Color.BLUE);
            paint.setColor(Color.RED);
            paint.setStyle(Paint.Style.FILL);
            LinearGradient linGrad = new LinearGradient(0, 0, 50, 50, Color.RED, Color.BLACK, Shader.TileMode.REPEAT);
            paint.setShader(linGrad);
            canvas.drawCircle(200,200,70,paint); */

         /*   Paint paint = new Paint();
            canvas.drawColor(Color.BLUE);
            paint.setColor(Color.RED);
            paint.setStyle(Paint.Style.FILL);
            RadialGradient radGrad = new RadialGradient(0, 0,15, Color.RED, Color.BLACK, Shader.TileMode.REPEAT);
            paint.setShader(radGrad);
            canvas.drawCircle(200,200,70,paint); */

        /*    Paint paint = new Paint();
            canvas.drawColor(Color.BLUE);
            paint.setColor(Color.RED);
            paint.setStyle(Paint.Style.FILL);
            SweepGradient swpGrad = new SweepGradient(100, 100,Color.RED, Color.BLACK);
            paint.setShader(swpGrad);
            canvas.drawCircle(200,200,70,paint); */

           /* Bitmap myBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.sushpic);
            canvas.drawBitmap(myBitmap, new Rect(20, 20,myBitmap.getWidth()-20, myBitmap.getHeight()-20),  new Rect(0, 0,myBitmap.getWidth(), myBitmap.getHeight()), null); */

           /* Paint paint = new Paint();
            paint.setColor(Color.BLUE);
            paint.setTextSize(32);
            paint.setTypeface(Typeface.create(Typeface.SERIF,Typeface.BOLD));
            canvas.drawText("Hello World!", 20, 50, paint); */




        }
    }
}