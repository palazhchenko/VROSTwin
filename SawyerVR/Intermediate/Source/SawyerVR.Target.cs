using UnrealBuildTool;

public class SawyerVRTarget : TargetRules
{
	public SawyerVRTarget(TargetInfo Target) : base(Target)
	{
		DefaultBuildSettings = BuildSettingsVersion.Latest;
		IncludeOrderVersion = EngineIncludeOrderVersion.Latest;
		Type = TargetType.Game;
		ExtraModuleNames.Add("SawyerVR");
	}
}
