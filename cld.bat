@echo off
setlocal

:: Forward all arguments to the DaemonServer via netcat or equivalent.
:: Since Windows doesn't always have nc, we can use a tiny PowerShell snippet to send the string over TCP.

set "cmd_str=cld %*"
powershell -NoProfile -Command "$tcp = New-Object System.Net.Sockets.TcpClient('127.0.0.1', 9090); $stream = $tcp.GetStream(); $writer = New-Object System.IO.StreamWriter($stream); $reader = New-Object System.IO.StreamReader($stream); $writer.WriteLine('%cmd_str%'); $writer.Flush(); $response = $reader.ReadLine(); Write-Host $response; $tcp.Close()"
