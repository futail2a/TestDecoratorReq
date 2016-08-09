package RTC;


/**
* RTC/RangerConfig.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��38�b JST
*/

public final class RangerConfig implements org.omg.CORBA.portable.IDLEntity
{

  /// Minimum scannable angle in radians.
  public double minAngle = (double)0;

  /// Maximum scannable angle in radians.
  public double maxAngle = (double)0;

  /// Angular resolution in radians.
  public double angularRes = (double)0;

  /// Minimum scannable range in metres.
  public double minRange = (double)0;

  /// Maximum scannable range in metres.
  public double maxRange = (double)0;

  /// Range resolution in metres.
  public double rangeRes = (double)0;

  /// Scanning frequency in Hertz.
  public double frequency = (double)0;

  public RangerConfig ()
  {
  } // ctor

  public RangerConfig (double _minAngle, double _maxAngle, double _angularRes, double _minRange, double _maxRange, double _rangeRes, double _frequency)
  {
    minAngle = _minAngle;
    maxAngle = _maxAngle;
    angularRes = _angularRes;
    minRange = _minRange;
    maxRange = _maxRange;
    rangeRes = _rangeRes;
    frequency = _frequency;
  } // ctor

} // class RangerConfig
