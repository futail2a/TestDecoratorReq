package RTC;


/**
* RTC/Hypothesis2D.java .
* IDL-to-Java�R���p�C��(�|�[�^�u��)�A�o�[�W����"3.2"�ɂ���Đ�������܂���
* idl/InterfaceDataTypes.idl����
* 2016�N8��9�� 13��07��38�b JST
*/

public final class Hypothesis2D implements org.omg.CORBA.portable.IDLEntity
{

  /// Mean of the localisation hypothesis.
  public RTC.Pose2D mean = null;

  /// Covariance matrix of the mean pose.
  public RTC.Covariance2D covariance = null;

  /// Weight of this hypothesis for mixing.
  public double weight = (double)0;

  public Hypothesis2D ()
  {
  } // ctor

  public Hypothesis2D (RTC.Pose2D _mean, RTC.Covariance2D _covariance, double _weight)
  {
    mean = _mean;
    covariance = _covariance;
    weight = _weight;
  } // ctor

} // class Hypothesis2D
