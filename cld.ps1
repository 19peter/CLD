param(
    [Parameter(ValueFromRemainingArguments=$true)]
    [string[]]$Args
)

$cmdStr = "cld " + ($Args -join " ")

try {
    $tcp = New-Object System.Net.Sockets.TcpClient('127.0.0.1', 9090)
    $stream = $tcp.GetStream()
    $writer = New-Object System.IO.StreamWriter($stream)
    $reader = New-Object System.IO.StreamReader($stream)
    
    $writer.WriteLine($cmdStr)
    $writer.Flush()
    
    $response = $reader.ReadLine()
    Write-Host $response
    
    $tcp.Close()
} catch {
    Write-Host "Failed to connect to DaemonServer on port 9090. Is it running?" -ForegroundColor Red
}
