# mobrisk-android-sample

## ✅ Correct BlackBox Sample

**Feature:** 

The length of blackbox is very short, and the length is 26.

**BlackBox Example:**

```text
BIPHi1690440707BatijlFjtbf
```


## ❌ Wrong BlackBox Sample

**Feature:** 

The length of the blackbox obtained for the first time is very long as expected, and the network permission may not be obtained yet.
However, it is a problem if it is too long several times in a row. Please check whether the initialization parameters are filled incorrectly.

There are several possibilities for the problem.

- The current application has not obtained the network permission.

- The appKey, partner and country are filled incorrectly.

- Call function getBlackBox first without executing the function initWithOptions once after the app is running.

If you confirm that the above problems do not exist, please contact us in the following two ways:

+ **Raise issue**

  Please describe the problem in issue and bring the wrong blackbox.

+ **Contact our technical support**

  Please contact our technical support, and describes your problem with wrong blackbox.

**BlackBox Example:**

```text
tdfpeyJkIjoiM3dBQWdDeUpEa1NGS082d2V3dnFteG1IcER1eXhyRUlfdmVkLXE5RHljdWk1RzlkWlFJTkE4TUNVYUlkaDFSY3E1ZTN1NzRZR2NzQXYtMS12Zld0Yjk5a29icFhXdDc5aTNJMlZMMnViMl94T0tnWHJQc0FqSmlwbnVPY2dRRzFzQTRaTjlNcXBPN0xqNEhBbzJIX3lXM0czMU1pUFZZZ2FESnRsa1h5dHBkSllFUVIzNjNqaEtSMk9wZlNxcWRiTE1taTgxbDlPZDVmRkVyR2FoRExfOXhrRVM0UEE3MlJtS3pTb3BGNnkzLUtMWmhpU25XbjhrWlFZTGNQUG9DRFZLck1Bb3JkWHZCNlNXNEVvb2lTMEdIT3FuV0t4a0dqYXlrSlJLUDBuLWU0aVduTmNhWmRER0FESjVJOTN6VWhjVEtzTGxlOUI0V19LZVRRQWVGNU0waDJyVTlwcTctVFQxQWVCWGRqZHF6T0QwWFhPbUhYZzRLWV92clNCaGJBNzlwektaR0d6bUJRYjRtbm5KS1duTWlmekVWRTA2Wm91X3hOcUtGbXhZN3BHSS1WdExsQXk1UzdUbkMyc3dheWFZQnpUaEZQMU41SEhoeGFmU0FoOTZwSXAzTS0yS3gtc216dUVMMmItTE1kNHlOTlRsYk5rZmJUbW1EZjQ1WEVHTy1fSVZsS3F6Sm1BVlNjdnY4MVh6WmgtQ2JPczJvX0s2d0NPVW9YU2tzVzJCdUdYTHR3eVljQ0Jpckljb1FnYnVFZ2lvQU5UTFJJSmlMQ2ZMS2gtUXBlRDJjS0JtR3VaM0JqMHFGLUJIX3Bhc1FDR2lYY0R5ajFMLW9qTEJKajJ6ek9GOUhwaE85b2c5OEx6VzlpRUJZNU5NZmJ2RE9fSGpjNmt0Y1dvV2tfdHFwcmJEZ2UyaXpwbUVfZUdOc2FpTkVWOVZ4VkdkaDBEWjBlMUsxSXdCZUY3cnBjekNadU9Ia0hsYTNLUXlaQXV2NzlvRGJDYlpQOXpZaVZTbmRQMk56MGFEdXRaMDhRWTNLM1BHZmFrU1ZfTS10eTNYeFhFU0RqVHVOR1VuNmc0MVZxdUo2ODBIQlI5c2hfdGV1WjN4R3FDdHAxME4xdkU5TW04YVllc2l4QmRTYUNjS1d2Rkk1MXpoaDQ1cFp2TDFxQU9oOENBRUJXVXBXMHhyTzVodjBvSVhfckxwNkpUWi0yOXhJRnM1TUNBa0JjWkNXTFdpdHpMbGxfdktjckNNNGVJZl9tNFRWdXFoeVdwSkktYXFJZ0oyR2VjV0RsdldzYzVJcExZZTJLbDdYNTB5ZEtWcEVfM19wUC0tT3dkb19xbkZwYWp5S0tCUWxZQ0NEVktrRjFkdHFVMHBleVJIZ2F5Sjl0ZVpudVNZQTkzYm9NM2ZsVlJEOXZuck5xWldycVBmX2tvSkMzLTVqczlNU1pveWdVUllnTTNzeXRia29tSkFrZzM0LU5saU9HdkhFMkFhaDhuMjFlNEJRQ0Q1WjJjOXVpanBVNmFTQWVMM2ZJYW42LVRhM1ZXd1V0MVNDdy05RGFJQWU5VGRXcXRkYUV5NldTSzgyaGVtNzdTVEhyMjRTaUpXQmVQNmNKcVFWQTNSU1c5bGx2LS1pRlJRRVdLenp1bDBERlMyZm9XSWM2Ym4zUmxuRnI5MjBwbEZHcllHR3NSTFVVbUY2YVVndHgzNGVvUE5TUWxZRThMSDNUaHhZd25DZ013ei1pNi13OXdsV2tsRkI1NXE5SXlzSnctRzYtOTlTVzZaakF4VEJfZUhsaF9zNGZwSG14aTR4eVhETHV6RXp0QzdocUVRU3QtVlFTUXlEQ2c2VjVaWnVNRUpWb3dscTFqWHR1SUVYaGU3V3hGUEFUdjNKU090UmZtRjE2czUwWDNPYlowSkp6eEhfWVNvalYzbjhxa05fcjE3b0pKS05CM3AtTnpPOFh1OUpCUS1NMG9hVE55Z1h5dHVZR3c2c2xoc2Q3dGVudlRRWndxZUNxVkEtWk82b2dIQ0YyUkNTSkw4NF9aWV9HRW1sTVBseHRqVzJkZmNoc19VNmZZZEVST0tyQ0p4czZ5Uko1YVF0Sk1jbnc4emVaVTRvMVYzZmNxenJPYU1tYUFSVVJnNXFxbTVJRnJ5dXlrNHpvbDZKRVBqRzUzTUJha05OMEZzb3FWelV0RGtQcl8zVkRaOXlCakw5S3Jkd0lBMnEyY2hQRkdQWnlYOVBXRHpZX2dLZ3FCeEg3eEx5dng5WG9aVXpCdFItbTFROWxJT0JQeGFmVWhxOHJnSjV1YU1Ka1pzeTJGeklyblFvUHhmR3VzWVY0Q3FRQlE0WDRjbEw4Tk41akp6SEVPNzdrRDFnUGVNUXFkbndMeFI1UllDS21nZ0ozYjRYdW50SXBMRldIcC1RNkt2ZE9LUk5GQk5PUUtDY1BOc1pKcDNXcTZ3eU1JUk9tV0hzblJZRDhQNUxzbUE3eEo1WHktM0g1dzBoUE1MaTlqdEpETGxhdmJSSWJWaDZ3VHVILThHd2hxUnlkbEM4SzZGTE5leDlrX0QxQnVjQUF1VnFUVVp6MjVpa3NMbjhYcnhhNEJDeDhGUHM4bEZmdERndGZEVVRuS3JfclVJZUc5dlJvX1BUNkNQZEN0am9BbV9fSlJWcmtzRHpVN0h6NlNtRllERmMzVklMV3VRVVQxbmJuemZZUXJDTjREdGk0ZHhqSHBiMkJUckhwMm5obmp1MDZ6V2RVZTdMMmhXRVlySFI3dVRBbnFWZTlOcEh2UmU3VEZsTGRrWjNROWRJc09NWk5BYTlNcmRSOUlvaXJsQ3NTeXU5LTF2UVVIN1FhZmdTcC14MTZhNkZVYUxpdXNWZTd5MUlHMW5WNFFSdGtDVG5SeDlRa09NUkVpVzRnUF9GR2VMNng1LU1QTjNyNUJ3RVcyZmQ2WFBrYjMtZzliQlBuR0N5YzFZX0UwenpWN2k4Y3oyMmxfRDhFQU5BNDVfS3BCb19tcGtXUWc2V2lCWm56QUZkbjlPbk5kMGNaUFZqNVV1UlRBWEFPMlgwSkZjSnJiSXY4elA2RFg5WkthYldKeEsxNkRTQjhMTmtxSlgtMlNEZ0pJdGk0Q3dUakptb0JMNk1uSE82aFh2MnhUNjFiZHZwZU4xSHhEZV94MVpHSzloelpnYUlRTDVySnBOWS12ZmZuTGVQaTQ5M18zd3VwRk9jQm5GczBDcnk4TDZOZF9wWGtvdGkyWWhIWUpUclU0NzM1dDl3NlhxdERMaDAtN2UzOUV5SEhDTGl1Tk1zZGVHejlXbXRLVnRVZkF0NkZibXhhMDFTek9YRGVKRUpDeXk2Qjlxem53MTkwVzR6ZHdFbE5oRXZkVHZIbFhjVGZMdXpoVW5fVnlrcm1YQmRfY0FIXzVZdHJieWRHaC1TSXdVWF8tbVozVHVVcEVoY254YTRvQkMtMWt0QVpubXR5NzRtV1MtR2JiUEpwcG8wN3JlajNPa3prX3BreGROcmZPckNNYXp5TE90cDZpSTloeE5BeGJYSzBnUzFqdjdRQ0FNTmZwbWVjdnJfLXJSRGRfM1BGTTdVb1ZzR2tZRldaVWpLMm03WVFmQTdxQ0MzQVpjTFlxSnExS0ljSEpwZFBwY09jcmQ5WWpuX0RCRjFQWEd0QUpBODhjR2t5SGhKQ3VEQTNCRG81UWZadlI2aDB3Umc4Y19XMEhxWW1nb1Zzc2o2eW9yR2M0N3AxSnkybVZ6RWY0SDViZFV4ZGhPXzdXallSQlhvcVA4cC1RcjQyREZSaVJEdVlDdllLTzFMMHJfYXFHR2VrMGcxNGQ4NjBpMmtXbldLa3JiSlNVcFR4UHQ2R1c5bko0UzloVldJQTlISDZmRW02ajZaTmJpU0cxSWFMX3FxdTcwcGJmZ3ZOOWwzU0ExdUpLN3lqaV9OajU4Mnh2UUdSNjJOdGpXemtWM3RlRW9wMW5zcTNielFybWJSUHBmVlBjcEJ0YnpCTmtOMGprRWgxNXpndWYzNDYwQzgxVzhSM0U3SXJfYjFKZ2hTX3ZXY2F3S1VrLWtFaHg5LXlUMDdkd3ZUWUN1bEtOVnA1UUJuYTJKRm14VVlFbFd1R2dJNUktUFVUTHJhMlhhb3RXdjJOWWdWQmRtMFprVkdoMVZrS0JValBqQWhkSloxSDhMU0ZNamIxTWZmR19TcGswNHhxam1OQmlPWVZQdEk4bkpiNEo1dzlIWi12UkhJVnVLZ3F2Z0ZlTWxvSk1DeFZ3SkZpalEiLCJvcyI6IjIiLCJlIjotMTA5LCJzdCI6IjE2OTA0NDIxMTMxMzciLCJ2IjoiNC4xLjQifQ
```
