package org.firstinspires.ftc.teamcode.auto;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.RobotLog;

import org.firstinspires.ftc.teamcode.ProgrammingBoardHardware;
import org.firstinspires.ftc.teamcode.common.RobotConstants;

@Autonomous(name = "Test", group = "TeamCode")
//@Disabled
public class FTCAutoBasic extends LinearOpMode {

    private static final String TAG = "FTCAutoBasic";

    private RobotConstants.Alliance alliance = RobotConstants.Alliance.NONE;
    private ProgrammingBoardHardware robot;

    // Main class for the autonomous run.
    @Override
    public void runOpMode() {
        RobotLog.d(TAG, "Running OpMode FTCAutoBasic");
        robot = new ProgrammingBoardHardware(hardwareMap);

        // NOTE: the order of these two operations is important. If they
        // are reversed, the robot does not move.
        robot.leftFrontMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        robot.leftFrontMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);

        // Wait for the game to start (driver presses PLAY)
        telemetry.addData("FTCAutoBasic", "hit play when ready");
        telemetry.update();
        waitForStart();

        ElapsedTime runtime = new ElapsedTime();
        try {
            RobotLog.d(TAG, "Driving the left front motor");
            runtime.reset();
            robot.leftFrontMotor.setPower(0.5);
            while (opModeIsActive() && (runtime.seconds() < 3.0)) {
                // Robot moves
                telemetry.addData("Driving", "Left front");
                telemetry.update();
            }
            RobotLog.d(TAG, "Finished driving the left front motor");
        } finally {
            robot.leftFrontMotor.setPower(0.0);
            RobotLog.i(TAG, "Exiting FTCAutoBasic");
            telemetry.addData("FTCAutoBasic", "COMPLETE");
            telemetry.update();
        }
    }

}

