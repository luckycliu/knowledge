@echo off
cd samples-and-tests
for /d %%D in (*) do (
  cd %%D
  for %%E in (tmp test-result) do (
    del /s/f/q %%E > nul
  )
  cd ..
)
cd ..
del /s/f/q dist > nul
pause
play build-module