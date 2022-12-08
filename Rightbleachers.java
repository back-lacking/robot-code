package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name = "RightBleachers", group = "Linear Opmode")

public class Rightbleachers extends LinearOpMode{
   
    private DcMotorEx frontleft = null;
    private DcMotorEx frontright = null;
    private DcMotorEx backleft = null;
    private DcMotorEx backright = null;
    boolean down = false, forward = false, backward = false;
   
   @Override
        public void runOpMode() throws InterruptedException    {
 
        frontleft = hardwareMap.get(DcMotorEx.class, "frontleft");
        frontright = hardwareMap.get(DcMotorEx.class, "frontright");
        backleft = hardwareMap.get(DcMotorEx.class, "backleft");
        backright = hardwareMap.get(DcMotorEx.class, "backright");
       
        frontleft.setDirection(DcMotor.Direction.REVERSE);
        frontright.setDirection(DcMotor.Direction.FORWARD);
        backleft.setDirection(DcMotor.Direction.REVERSE);
        backright.setDirection(DcMotor.Direction.FORWARD);
       
        frontleft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        frontright.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backleft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        backright.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
       
        backleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
 
        waitForStart();
        StrafeRight(0.8, 7);
        DriveForward(0.4, 6);
        DriveBackward(0.4,6);
        StrafeRight(0.8, 5);
        DriveForward(0.6, 20);
        }
   
   
   public int inchesToTicks(int inches){       //function to translate inches to ticks for the motors
       final double ticksPerRev = 1120 , wheelDiameter = 4.0, ticksPerInch = ticksPerRev / (wheelDiameter * 3.1415);
 
       return (int)(inches * ticksPerInch);
   }
      public void StrafeRight(double power, int distance)
    {
        backleft.setMode(DcMotor.RunMode.RESET_ENCODERS);
        backright.setMode(DcMotor.RunMode.RESET_ENCODERS);
        frontleft.setMode(DcMotor.RunMode.RESET_ENCODERS);
        frontright.setMode(DcMotor.RunMode.RESET_ENCODERS);
       
        distance=inchesToTicks(distance);
       
        backleft.setTargetPosition(-distance);
        backright.setTargetPosition(distance);
        frontleft.setTargetPosition(distance);
        frontright.setTargetPosition(-distance);
       
        backleft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backright.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontleft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontright.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        frontright.setPower(power);
        frontleft.setPower(power);        
        backright.setPower(power);
        backleft.setPower(power);
       
        while(backleft.isBusy() || backright.isBusy() || frontleft.isBusy() || frontright.isBusy());
        {
           
        }
       
        frontright.setPower(0);
        frontleft.setPower(0);        
        backright.setPower(0);
        backleft.setPower(0);
       
        backleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    }
       
    public void DriveForward(double power, int distance)
    {
        backleft.setMode(DcMotor.RunMode.RESET_ENCODERS);
        backright.setMode(DcMotor.RunMode.RESET_ENCODERS);
        frontleft.setMode(DcMotor.RunMode.RESET_ENCODERS);
        frontright.setMode(DcMotor.RunMode.RESET_ENCODERS);
       

       
        distance=inchesToTicks(distance);
       
        backleft.setTargetPosition(distance);
        backright.setTargetPosition(distance);
        frontleft.setTargetPosition(distance);
        frontright.setTargetPosition(distance);
       
        backleft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backright.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontleft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontright.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        frontright.setPower(power);
        frontleft.setPower(power);        
        backright.setPower(power);
        backleft.setPower(power);
       
        while(backleft.isBusy() || backright.isBusy() || frontleft.isBusy() || frontright.isBusy());
        {
           
        }
       
        frontright.setPower(0);
        frontleft.setPower(0);        
        backright.setPower(0);
        backleft.setPower(0);
       
        backleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    }    
        public void DriveBackward (double power, int distance)
    {
        backleft.setMode(DcMotor.RunMode.RESET_ENCODERS);
        backright.setMode(DcMotor.RunMode.RESET_ENCODERS);
        frontleft.setMode(DcMotor.RunMode.RESET_ENCODERS);
        frontright.setMode(DcMotor.RunMode.RESET_ENCODERS);
       
        distance=inchesToTicks(distance);
       
        backleft.setTargetPosition(-distance);
        backright.setTargetPosition(-distance);
        frontleft.setTargetPosition(-distance);
        frontright.setTargetPosition(-distance);
       
        backleft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backright.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontleft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontright.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        frontright.setPower(power);
        frontleft.setPower(power);        
        backright.setPower(power);
        backleft.setPower(power);
       
        while(backleft.isBusy() || backright.isBusy() || frontleft.isBusy() || frontright.isBusy());
        {
           
        }
       
        frontright.setPower(0);
        frontleft.setPower(0);        
        backright.setPower(0);
        backleft.setPower(0);
       
        backleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    }    
        public void  StrafeLeft (double power, int distance)
    {
        backleft.setMode(DcMotor.RunMode.RESET_ENCODERS);
        backright.setMode(DcMotor.RunMode.RESET_ENCODERS);
        frontleft.setMode(DcMotor.RunMode.RESET_ENCODERS);
        frontright.setMode(DcMotor.RunMode.RESET_ENCODERS);
       
        distance=inchesToTicks(distance);
       
        backleft.setTargetPosition(-distance);
        backright.setTargetPosition(distance);
        frontleft.setTargetPosition(distance);
        frontright.setTargetPosition(-distance);
       
        backleft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        backright.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontleft.setMode(DcMotor.RunMode.RUN_TO_POSITION);
        frontright.setMode(DcMotor.RunMode.RUN_TO_POSITION);

        frontright.setPower(power);
        frontleft.setPower(power);        
        backright.setPower(power);
        backleft.setPower(power);
       
        while(backleft.isBusy() || backright.isBusy() || frontleft.isBusy() || frontright.isBusy());
        {
           
        }
       
        frontright.setPower(0);
        frontleft.setPower(0);        
        backright.setPower(0);
        backleft.setPower(0);
       
        backleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        backright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontleft.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        frontright.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
    }
}   
