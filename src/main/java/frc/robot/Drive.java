/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
/**
 * Add your docs here.
 */
import com.ctre.phoenix.motorcontrol.can.TalonFX;
public class Drive {
    private static Drive instance_;
    
    public static Drive getInstance() {
        if(instance_ == null) {
            instance_ = new Drive();
        }
        return instance_;
    }
    TalonSRX Rmot1;
    TalonSRX Rmot2;
    TalonSRX Lmot1;
    TalonSRX Lmot2;
    public Drive() {
        Lmot1 = new TalonSRX(10);
        Lmot2 = new TalonSRX(12);
        Rmot1 = new TalonSRX(11);
        Rmot2 = new TalonSRX(13);
    }
    public void RightDrive(double input){
       Rmot1.set(ControlMode.PercentOutput, -input*0.2);
       Rmot2.set(ControlMode.PercentOutput, -input*0.2);
    }
    
    public void LeftDrive (double input) {
       Lmot1.set (ControlMode.PercentOutput, -input*0.2);
       Lmot2.set(ControlMode.PercentOutput, input*0.2);
    }
}
