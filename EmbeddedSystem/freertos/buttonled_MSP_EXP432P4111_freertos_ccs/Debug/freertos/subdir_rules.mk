################################################################################
# Automatically-generated file. Do not edit!
################################################################################

SHELL = cmd.exe

# Each subdirectory must supply rules for building sources it contributes
freertos/%.obj: ../freertos/%.c $(GEN_OPTS) | $(GEN_FILES) $(GEN_MISC_FILES)
	@echo 'Building file: "$<"'
	@echo 'Invoking: ARM Compiler'
	"C:/ti/ccs1010/ccs/tools/compiler/ti-cgt-arm_20.2.5.LTS/bin/armcl" -mv7M4 --code_state=16 --float_support=FPv4SPD16 -me --include_path="C:/Users/cse/Downloads/freertos/buttonled_MSP_EXP432P4111_freertos_ccs" --include_path="C:/Users/cse/Downloads/freertos/buttonled_MSP_EXP432P4111_freertos_ccs/Debug" --include_path="C:/ti/simplelink_msp432p4_sdk_3_40_01_02/source" --include_path="C:/ti/simplelink_msp432p4_sdk_3_40_01_02/source/third_party/CMSIS/Include" --include_path="C:/ti/simplelink_msp432p4_sdk_3_40_01_02/source/ti/posix/ccs" --include_path="C:/ti/ccs1010/ccs/tools/compiler/ti-cgt-arm_20.2.5.LTS/include" --include_path="C:/Users/cse/Downloads/freertos/buttonled_MSP_EXP432P4111_freertos_ccs/freertos/include" --include_path="C:/Users/cse/Downloads/freertos/buttonled_MSP_EXP432P4111_freertos_ccs/freertos/portable/CCS/ARM_CM4F" --define=__MSP432P4111__ --define=CONFIG_LEDCOUNT=3 -g --diag_warning=225 --diag_warning=255 --diag_wrap=off --display_error_number --gen_func_subsections=on --preproc_with_compile --preproc_dependency="freertos/$(basename $(<F)).d_raw" --include_path="C:/Users/cse/Downloads/freertos/buttonled_MSP_EXP432P4111_freertos_ccs/Debug/syscfg" --obj_directory="freertos" $(GEN_OPTS__FLAG) "$<"
	@echo 'Finished building: "$<"'
	@echo ' '


