package RTC;


/**
* RTC/PointFeature.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��38�b JST
*/

public final class PointFeature implements org.omg.CORBA.portable.IDLEntity
{

  /// Probability of the feature.
  public double probability = (double)0;

  /// Position of the feature.
  public RTC.Point2D position = null;

  /// Covariance matrix of the position.
  public RTC.PointCovariance2D covariance = null;

  public PointFeature ()
  {
  } // ctor

  public PointFeature (double _probability, RTC.Point2D _position, RTC.PointCovariance2D _covariance)
  {
    probability = _probability;
    position = _position;
    covariance = _covariance;
  } // ctor

} // class PointFeature
