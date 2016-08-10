package RTC;


/**
* RTC/IntensityData.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��10�� 14��37��13�b JST
*/

public final class IntensityData implements org.omg.CORBA.portable.IDLEntity
{

  /// Time stamp.
  public RTC.Time tm = null;

  /// Intensity values normalised to between 0 and 1.
  public double intensities[] = null;

  /// Geometry of the ranger at the time the scan data was measured.
  public RTC.RangerGeometry geometry = null;

  /// Configuration of the ranger at the time the scan data was measured.
  public RTC.RangerConfig config = null;

  public IntensityData ()
  {
  } // ctor

  public IntensityData (RTC.Time _tm, double[] _intensities, RTC.RangerGeometry _geometry, RTC.RangerConfig _config)
  {
    tm = _tm;
    intensities = _intensities;
    geometry = _geometry;
    config = _config;
  } // ctor

} // class IntensityData
