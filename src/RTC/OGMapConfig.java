package RTC;


/**
* RTC/OGMapConfig.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��38�b JST
*/

public final class OGMapConfig implements org.omg.CORBA.portable.IDLEntity
{

  /// Scale on the x axis (metres per cell).
  public double xScale = (double)0;

  /// Scale on the y axis (metres per cell).
  public double yScale = (double)0;

  /// Number of cells along the x axis.
  public int width = (int)0;

  /// Number of cells along the y axis.
  public int height = (int)0;

  /// Pose of the cell at (0, 0) in the real world.
  public RTC.Pose2D origin = null;

  public OGMapConfig ()
  {
  } // ctor

  public OGMapConfig (double _xScale, double _yScale, int _width, int _height, RTC.Pose2D _origin)
  {
    xScale = _xScale;
    yScale = _yScale;
    width = _width;
    height = _height;
    origin = _origin;
  } // ctor

} // class OGMapConfig
