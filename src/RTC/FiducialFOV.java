package RTC;


/**
* RTC/FiducialFOV.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/

public final class FiducialFOV implements org.omg.CORBA.portable.IDLEntity
{

  /// Minimum range in metres at which fiducials can be detected.
  public double minRange = (double)0;

  /// Maximum range in metres at which fiducials can be detected.
  public double maxRange = (double)0;

  /// Receptive angle in radians of the sensor (centred about the forward direction).
  public double viewAngle = (double)0;

  public FiducialFOV ()
  {
  } // ctor

  public FiducialFOV (double _minRange, double _maxRange, double _viewAngle)
  {
    minRange = _minRange;
    maxRange = _maxRange;
    viewAngle = _viewAngle;
  } // ctor

} // class FiducialFOV
