using UnrealBuildTool;

public class SawyerVREditorTarget : TargetRules
{
	public SawyerVREditorTarget(TargetInfo Target) : base(Target)
	{
		DefaultBuildSettings = BuildSettingsVersion.Latest;
		IncludeOrderVersion = EngineIncludeOrderVersion.Latest;
		Type = TargetType.Editor;
		ExtraModuleNames.Add("SawyerVR");
	}
}
