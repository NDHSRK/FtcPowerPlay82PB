package org.firstinspires.ftc.teamcode.common;

public class RobotConstantsPowerPlay {

    public static final float D405_DEPTH_SCALE = 0.00010f;

    public enum OpMode {
        // Autonomous OpModes
        BLUE_A2, BLUE_A5, RED_F2, RED_F5,
        TEST, TEST_PRE_MATCH, TEST_ELEVATOR, AUTO_NO_DRIVE,

        // TeleOp OpModes
        TELEOP_NO_DRIVE,

        // Pseudo OpModes for running Autonomous actions from within
        // TeleOp. These are not "real" OpMoces in that they don't
        // appear on the Driver Station but they are present in
        // RobotAction.xml.
        TELEOP_TAKE_PICTURE_D405,

        // Pseudo OpModes for running EasyOpenCV webcam calibration
        // from TeleOp. These are also not "real" OpMoces in that
        // they don't appear on the Driver Station but they are
        // present in RobotAction.xml.
        GOLD_CUBE_GRAYSCALE_CALIBRATION
    }

    // The CameraId identifies each unique camera and its position on
    // the robot. Note that a camera may serve more than one purpose:
    // for example, the D405 swivel camera, which is mounted on the
    // cone delivery arm, may be pointed at either a unction or a cone
    // stack.
    public enum CameraId {
        VUFORIA_WEBCAM, EASY_OPENCV_WEBCAM, D405_SIGNAL_SLEEVE_CAMERA, D405_SWIVEL_CAMERA,
        CAMERA_NPOS
    }

    //## 01-09-2023 not currently used but may be useful in the future
    // if we need to know whether an image from the camera is right-
    // side-up or upside-down.
    public enum D405CameraOrientation {
        FRONT_SWIVEL, BACK_SWIVEL
    }

    public enum SignalSleeveRecognitionPath {
        COLOR, GRAYSCALE_SLASH, GRAYSCALE_SLASH_DEPTH
    }

    public enum SignalSleeveLocation {
        LOCATION_1, LOCATION_2, LOCATION_3, SIGNAL_SLEEVE_LOCATION_NPOS
    }

    public enum SwivelServoDirection {
        NEUTRAL, CONES, JUNCTION
    }

    public enum ConeStackRecognitionPath {
        RED_COLOR, COLOR_DEPTH, BLACK_RAILING
    }

    public enum JunctionRecognitionPath {
        RED_CHANNEL_GRAYSCALE, RED_CHANNEL_GRAYSCALE_BLUE_COLOR, TWO_CHANNEL_GRAYSCALE
    }

    // Vumark identifiers
    public enum SupportedVumark {
        VUMARK_1, VUMARK_2, VUMARK_3, VUMARK_4
    }

}